package com.example.findmissingnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/** lời giải
 *  theo cách tìm số bị mất thông thường của dãy từ 1 đến N, tính hiệu của dãy số đủ với dãy số thiếu là xong
 *  nhưng vì dãy số hiện tại là 1 đến N+1, dùng cách trên sẽ gây sai lệch
 *  do đó, biến dãy 1 đến N+1 thành dãy 1 đến N bằng cách trừ bớt đi số N=1 là xong
 *  BÙI TẤN MINH - Jonathan Bui
 *
 *  *Chương trình có đi kèm một bộ tạo số bị mất ngẫu nhiên*
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var N: List<Int> = generateListWithMissingNumber(40) // Change 40 to any number to change size of N List

        findMissingNumberByMinhsWay(N)
    }

    //
    fun generateListWithMissingNumber(N: Int): List<Int> {
        val fullList = (1..N+1).toMutableList()  // Create full list from 1 to N+1

        val missingNumber = (1..N+1).random()   // Pick random number in list

        fullList.remove(missingNumber)           // Remove random number from list

        fullList.shuffle()                       // Shuffle

        Log.d("Run Program", "Missing number (Correct Answer): ${missingNumber}")
        return fullList                          // return Shuffled list
    }

    fun findMissingNumberByMinhsWay(N: List<Int>): Int{
        var size = N.size

        var sumNormal = (size * (size +1)) /2 //sum without missing number
        var sumNList = N.sum()
        var sumNminus1 = (sumNList - (size +1)) // sumN - 41
        Log.d("Run Program", "answer By Minh's Way: ${ sumNormal - sumNminus1}")
        return   sumNormal - sumNminus1


    }


}