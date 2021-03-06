package org.coepi.android.ui.ble

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.coepi.android.databinding.FragmentBleBinding.inflate
import org.koin.androidx.viewmodel.ext.android.viewModel

class BleFragment : Fragment() {
    private val viewModel by viewModel<BleViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? = inflate(inflater, container, false).apply {
        lifecycleOwner = viewLifecycleOwner
        vm = viewModel
    }.root
}
