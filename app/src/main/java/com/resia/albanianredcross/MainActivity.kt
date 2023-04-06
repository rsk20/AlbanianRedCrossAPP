package com.resia.albanianredcross

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window


import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar()!!.hide();
        setContentView(R.layout.activity_main)

        class MainActivity : AppCompatActivity() {
            private val images = listOf(
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3
            )

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                viewPager2.adapter = ImageAdapter(images)
            }

            private class ImageAdapter(private val images: List<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
                    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
                    return ImageViewHolder(view)
                }

                override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
                    holder.bind(images[position])
                }

                override fun getItemCount(): Int = images.size

                inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                    private val imageView: ImageView = itemView.findViewById(R.id.imageView)

                    fun bind(imageResId: Int) {
                        imageView.setImageResource(imageResId)
                    }
                }
            }
        }



    }

    /*val viewPager: ViewPager2 = findViewById(R.id.ViewPager2)*/



}