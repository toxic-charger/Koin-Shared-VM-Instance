package io.koin.sharedinstance.vm.ui.main

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import org.koin.androidx.viewmodel.ext.android.getViewModel

class DemoDialogFragment : DialogFragment() {

    private val viewModel by lazy {
        requireParentFragment().getViewModel<MainViewModel>()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())

            .apply {
                setMessage("Show value?")
                setCancelable(false)
                setPositiveButton("Yes") { _, _ ->
                    Toast.makeText(
                        requireContext(),
                        "EditText Value: ${viewModel.text.value}",
                        Toast.LENGTH_LONG
                    ).show()
                }
                    .setNegativeButton(android.R.string.cancel, null) // Give up
            }.create()
    }
}