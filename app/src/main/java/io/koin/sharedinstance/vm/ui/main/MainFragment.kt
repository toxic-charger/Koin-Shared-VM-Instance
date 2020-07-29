package io.koin.sharedinstance.vm.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.koin.sharedinstance.vm.databinding.MainFragmentBinding
import io.koin.sharedinstance.vm.ui.main.MainFragmentDirections.toDemoDialog
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return MainFragmentBinding.inflate(inflater, container, false)
            .apply {
                lifecycleOwner = viewLifecycleOwner
                viewModel = mainViewModel
                button.setOnClickListener {
                    findNavController().navigate(toDemoDialog())
                }
            }.root
    }
}