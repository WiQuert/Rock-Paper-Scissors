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

        val choice = arrayOf("Rock", "Paper", "Scissors")
        var winScore = 0
        var drawScore = 0
        var loseScore = 0


        fun setWinScore() = with(binding){
            val winScoreText = getString(R.string.score_win) + " $winScore"
            tvWin.text = winScoreText
        }



        fun setDrawScore() = with(binding){
            val drawScoreText = getString(R.string.score_draw) + " $drawScore"
            tvDraw.text = drawScoreText
        }


        fun setLoseScore() = with(binding){
            val loseScoreText = getString(R.string.score_lose) + " $loseScore"
            tvLose.text = loseScoreText
        }

        setWinScore()
        setDrawScore()
        setLoseScore()

        fun rockChoice() = with(binding) {
            when (choice.random()) {
                "Rock" -> { imComputer.setImageResource(R.drawable.rock)
                    tvResult.visibility = View.VISIBLE
                    drawScore++
                    setDrawScore()
                    tvResult.text = getString(R.string.result_draw) }

                "Paper" -> { imComputer.setImageResource(R.drawable.paper)
                    tvResult.visibility = View.VISIBLE
                    loseScore++
                    setLoseScore()
                    tvResult.text = getString(R.string.result_lose) }
                "Scissors" -> { imComputer.setImageResource(R.drawable.scissors)
                    tvResult.visibility = View.VISIBLE
                    winScore++
                    setWinScore()
                    tvResult.text = getString(R.string.result_win) }
            }

        }

        fun paperChoice() = with(binding) {
            when (choice.random()) {
                "Rock" -> { binding.imComputer.setImageResource(R.drawable.rock)
                    tvResult.visibility = View.VISIBLE
                    winScore++
                    setWinScore()
                    tvResult.text = getString(R.string.result_win) }
                "Paper" -> { binding.imComputer.setImageResource(R.drawable.paper)
                    tvResult.visibility = View.VISIBLE
                    drawScore++
                    setDrawScore()
                    tvResult.text = getString(R.string.result_draw) }
                "Scissors" -> { binding.imComputer.setImageResource(R.drawable.scissors)
                    tvResult.visibility = View.VISIBLE
                    loseScore++
                    setLoseScore()
                    tvResult.text = getString(R.string.result_lose) }
            }

        }

        fun scissorsChoice() = with(binding) {
            when (choice.random()) {
                "Rock" -> { binding.imComputer.setImageResource(R.drawable.rock)
                    tvResult.visibility = View.VISIBLE
                    loseScore++
                    setLoseScore()
                    tvResult.text = getString(R.string.result_lose) }
                "Paper" -> { binding.imComputer.setImageResource(R.drawable.paper)
                    tvResult.visibility = View.VISIBLE
                    winScore++
                    setWinScore()
                    tvResult.text = getString(R.string.result_win) }
                "Scissors" -> { binding.imComputer.setImageResource(R.drawable.scissors)
                    tvResult.visibility = View.VISIBLE
                    drawScore++
                    setDrawScore()
                    tvResult.text = getString(R.string.result_draw) }
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




