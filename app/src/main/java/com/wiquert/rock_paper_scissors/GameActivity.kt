package com.wiquert.rock_paper_scissors

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.wiquert.rock_paper_scissors.databinding.ActivityGameBinding


class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val choice = listOf("Rock", "Paper", "Scissors")
        var winScore = 0
        var drawScore = 0
        var loseScore = 0
        val result = binding.tvResult



        fun rockChoice() {
            when (choice.random()) {
                "Rock" -> { binding.imComputer.setImageResource(R.drawable.rock)
                    result.visibility = View.VISIBLE
                    drawScore++
                    binding.tvDraw.text = {R.string.score_draw + drawScore}.toString()
                    result.text = R.string.result_draw.toString() }
                "Paper" -> { binding.imComputer.setImageResource(R.drawable.paper)
                    result.visibility = View.VISIBLE
                    loseScore++
                    binding.tvLose.text = {R.string.score_lose + loseScore}.toString()
                    result.text = R.string.result_lose.toString() }
                "Scissors" -> { binding.imComputer.setImageResource(R.drawable.scissors)
                    result.visibility = View.VISIBLE
                    winScore++
                    binding.tvWin.text = {R.string.score_win + winScore}.toString()
                    result.text = R.string.result_win.toString() }
            }

        }

        fun paperChoice() {
            when (choice.random()) {
                "Rock" -> { binding.imComputer.setImageResource(R.drawable.rock)
                    result.visibility = View.VISIBLE
                    winScore++
                    binding.tvWin.text = {R.string.score_win + winScore}.toString()
                    result.text = R.string.result_win.toString() }
                "Paper" -> { binding.imComputer.setImageResource(R.drawable.paper)
                    result.visibility = View.VISIBLE
                    drawScore++
                    binding.tvDraw.text = {R.string.score_draw + drawScore}.toString()
                    result.text = R.string.result_draw.toString() }
                "Scissors" -> { binding.imComputer.setImageResource(R.drawable.scissors)
                    result.visibility = View.VISIBLE
                    loseScore++
                    binding.tvLose.text = {R.string.score_lose + loseScore}.toString()
                    result.text = R.string.result_lose.toString() }
            }

        }

        fun scissorsChoice() {
            when (choice.random()) {
                "Rock" -> { binding.imComputer.setImageResource(R.drawable.rock)
                    result.visibility = View.VISIBLE
                    loseScore++
                    binding.tvLose.text = {R.string.score_lose + loseScore}.toString()
                    result.text = R.string.result_lose.toString() }
                "Paper" -> { binding.imComputer.setImageResource(R.drawable.paper)
                    result.visibility = View.VISIBLE
                    winScore++
                    binding.tvWin.text = {R.string.score_win + winScore}.toString()
                    result.text = R.string.result_win.toString() }
                "Scissors" -> { binding.imComputer.setImageResource(R.drawable.scissors)
                    result.visibility = View.VISIBLE
                    drawScore++
                    binding.tvDraw.text = {R.string.score_draw + drawScore}.toString()
                    result.text = R.string.result_draw.toString() }
            }

        }

        binding.bRock.setOnClickListener {
            binding.imUser.setImageResource(R.drawable.rock)
            rockChoice()
        }

        binding.bPaper.setOnClickListener {
            binding.imUser.setImageResource(R.drawable.paper)
            paperChoice()
        }

        binding.bScissors.setOnClickListener {
            binding.imUser.setImageResource(R.drawable.scissors)
            scissorsChoice()
        }
    }




}




