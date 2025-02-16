package com.example.nokhchi
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import androidx.fragment.app.Fragment as fragments




class ShopFragment : Fragment(R.layout.fragment_shop2) {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: ViewPagerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager = view.findViewById(R.id.viewPager)
viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        adapter = ViewPagerAdapter(childFragmentManager, lifecycle).apply {
            addFragment(FirstFragment())
            addFragment(SecondFragment())
        }

        viewPager.adapter = adapter
    }

    override fun onDestroyView() {
        viewPager.adapter = null
        super.onDestroyView()

    }


}





