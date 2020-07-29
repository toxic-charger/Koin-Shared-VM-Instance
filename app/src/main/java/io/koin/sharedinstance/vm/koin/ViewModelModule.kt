package io.koin.sharedinstance.vm.koin

import io.koin.sharedinstance.vm.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel()
    }
}