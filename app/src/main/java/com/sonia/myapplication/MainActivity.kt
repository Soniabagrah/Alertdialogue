package com.sonia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.sonia.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAlert.setOnClickListener{
            AlertDialog.Builder(this)
                .setTitle("class performance")
                .setMessage("Click Yes to add 2 to the value \n" +
                        "Click No to subtract 2 from the value")
                .setPositiveButton("Yes"){_,_->
                    num = num + 2
                    binding.tvZero.setText(num.toString())
                }
                .setNegativeButton("No"){_,_->
                    num = num - 2
                    binding.tvZero.setText(num.toString())
                }
                .setNeutralButton("Clear"){_,_->
                    num = 0
                    binding.tvZero.setText(num.toString())
                }
                .show()
        }
    }
}




