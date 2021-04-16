package com.example.greenstrides

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment



class Home : Fragment() {
    private lateinit var homeAvatar: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        homeAvatar = view.findViewById<ImageView>(R.id.homeAvatarImageView) as ImageView
        homeAvatar.setImageResource(R.drawable.avatar_happy)
    }

}