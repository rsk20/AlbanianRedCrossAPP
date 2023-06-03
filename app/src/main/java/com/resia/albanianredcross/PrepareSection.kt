package com.resia.albanianredcross

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PrepareSection.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrepareSection : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prepare_section, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fireButton = view.findViewById<ImageButton>(R.id.firebutton)

        fireButton.setOnClickListener {
            findNavController().navigate(
                R.id.fireP
            )
        }

        val earthquakeButton = view.findViewById<ImageButton>(R.id.earthquakebutton)

        earthquakeButton.setOnClickListener {
            findNavController().navigate(
                R.id.earthquakeP
            )
        }

        val floodButton = view.findViewById<ImageButton>(R.id.floodbutton)

        floodButton.setOnClickListener {
            findNavController().navigate(
                R.id.floodP
            )
        }

        val tornadoButton = view.findViewById<ImageButton>(R.id.tornadobutton)

        tornadoButton.setOnClickListener {
            findNavController().navigate(
                R.id.tornadoP
            )
        }

        val tsunamiButton = view.findViewById<ImageButton>(R.id.tsunamibutton)

        tsunamiButton.setOnClickListener {
            findNavController().navigate(
                R.id.tsunamiP
            )
        }

        val waterButton = view.findViewById<ImageButton>(R.id.waterbutton)

        waterButton.setOnClickListener {
            findNavController().navigate(
                R.id.waterP
            )
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PrepareSection.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PrepareSection().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

// Earthquake
// Fire
// Water
// Tornado
// Tsunami
// Flood