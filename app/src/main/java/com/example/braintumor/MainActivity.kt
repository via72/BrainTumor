package com.example.braintumor

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   // private var cameraButton: Button? = null
   // private var photoGalleryButton: Button? = null
   // private var imageTaken: ImageView? = null
    private var aboutusButton: Button? = null

    //val OPEN_CAMERA_BUTTON_REQUEST_ID = 1000
   // val OPEN_PHOTO_GALLERY_BUTTON_REQUEST_ID = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  cameraButton = findViewById<Button>(R.id.btnOpenCamera)
      //  photoGalleryButton = findViewById<Button>(R.id.btnOpenPhotoGallery)
     //   imageTaken = findViewById<ImageView>(R.id.imgTaken)
        aboutusButton = findViewById<Button>(R.id.aboutUs)

     //   btnOpenCamera.setBackgroundColor(Color.YELLOW)
     //   btnOpenPhotoGallery.setBackgroundColor(Color.MAGENTA)

      /*  cameraButton?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "THE CAMERA BUTTON IS CLICKED", Toast.LENGTH_LONG).show()
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, OPEN_CAMERA_BUTTON_REQUEST_ID)
        }) // anonymous function

        photoGalleryButton?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "THE PHOTO GALLERY BUTTON IS CLICKED", Toast.LENGTH_LONG).show()
            val galleryIntent =
                Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galleryIntent, OPEN_PHOTO_GALLERY_BUTTON_REQUEST_ID)
        })*/

        aboutusButton?.setOnClickListener(View.OnClickListener {
          //  Toast.makeText(this, "THE ABOUT US BUTTON IS CLICKED", Toast.LENGTH_LONG).show()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        })
    }

   /* override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == OPEN_CAMERA_BUTTON_REQUEST_ID) {
            if (resultCode == Activity.RESULT_OK) {
                val imageData = data?.getExtras()?.get("data") as Bitmap
                imageTaken?.setImageBitmap(imageData)
            }
        }
        if (requestCode == OPEN_PHOTO_GALLERY_BUTTON_REQUEST_ID) {
            if (resultCode == Activity.RESULT_OK) {
                val contentURI = data?.getData()
                val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, contentURI)
                imgTaken.setImageBitmap(bitmap)
            }
        }
    }*/
}