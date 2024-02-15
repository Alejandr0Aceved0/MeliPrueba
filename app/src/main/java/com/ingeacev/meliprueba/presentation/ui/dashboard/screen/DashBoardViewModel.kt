package com.ingeacev.meliprueba.presentation.ui.dashboard.screen

import androidx.lifecycle.ViewModel
import com.ingeacev.meliprueba.domain.use_cases.GetDefaultProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

@HiltViewModel
class DashBoardViewModel @Inject constructor(
    private val getActivitiesCountUseCase: GetDefaultProductsUseCase,
    private val coroutineDispatcher: CoroutineDispatcher
) : ViewModel() {

}