package com.ingeacev.core.utils

import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.provider.OpenableColumns
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream


/**
 * Returns the Bearer Authentication Header for the given token of type [String]
 */
fun String.getBearerAuthHeader(): String = HTTP_HEADER_BEARER_TOKEN_PREFIX.plus(this)


fun uriToFile(context: Context, uri: Uri?): File {
    val fileContents = try {
        context.contentResolver.openInputStream(uri!!)
    } catch (e: FileNotFoundException) {
        null
    }

    val file = when (uri!!.scheme) {
        "content" -> File(context.cacheDir, context.contentResolver.getFileName(uri))
        else -> File(context.cacheDir, uri.lastPathSegment!!)
    }

    FileOutputStream(file).use {
        it.write(fileContents?.readBytes())
    }

    return file
}


fun ContentResolver.getFileName(fileUri: Uri): String {
    val returnCursor = query(fileUri, null, null, null, null)
    return buildString {
        if (returnCursor != null) {
            val nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            returnCursor.moveToFirst()
            append(returnCursor.getString(nameIndex))
            returnCursor.close()
        }
    }
}

fun ByteArray.toBitmap(): Bitmap {
    return BitmapFactory.decodeByteArray(this, 0, this.size)
}