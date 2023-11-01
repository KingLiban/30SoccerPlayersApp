package com.example.a30days30soccerplayers.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days30soccerplayers.R

data class Player(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val team: Int,
    @StringRes val dob: Int,
    @StringRes val funFact: Int
)

val players = listOf(
    Player(R.drawable.player_1, R.string.player_name_1, R.string.player_team_1, R.string.player_dob_1, R.string.player_fun_fact_1),
    Player(R.drawable.player_2, R.string.player_name_2, R.string.player_team_2, R.string.player_dob_2, R.string.player_fun_fact_2),
    Player(R.drawable.player_3, R.string.player_name_3, R.string.player_team_3, R.string.player_dob_3, R.string.player_fun_fact_3),
    Player(R.drawable.player_4, R.string.player_name_4, R.string.player_team_4, R.string.player_dob_4, R.string.player_fun_fact_4),
    Player(R.drawable.player_5, R.string.player_name_5, R.string.player_team_5, R.string.player_dob_5, R.string.player_fun_fact_5),
    Player(R.drawable.player_6, R.string.player_name_6, R.string.player_team_6, R.string.player_dob_6, R.string.player_fun_fact_6),
    Player(R.drawable.player_7, R.string.player_name_7, R.string.player_team_7, R.string.player_dob_7, R.string.player_fun_fact_7),
    Player(R.drawable.player_8, R.string.player_name_8, R.string.player_team_8, R.string.player_dob_8, R.string.player_fun_fact_8),
    Player(R.drawable.player_9, R.string.player_name_9, R.string.player_team_9, R.string.player_dob_9, R.string.player_fun_fact_9),
    Player(R.drawable.player_10, R.string.player_name_10, R.string.player_team_10, R.string.player_dob_10, R.string.player_fun_fact_10),
    Player(R.drawable.player_11, R.string.player_name_11, R.string.player_team_11, R.string.player_dob_11, R.string.player_fun_fact_11),
    Player(R.drawable.player_12, R.string.player_name_12, R.string.player_team_12, R.string.player_dob_12, R.string.player_fun_fact_12),
    Player(R.drawable.player_13, R.string.player_name_13, R.string.player_team_13, R.string.player_dob_13, R.string.player_fun_fact_13),
    Player(R.drawable.player_14, R.string.player_name_14, R.string.player_team_14, R.string.player_dob_14, R.string.player_fun_fact_14),
    Player(R.drawable.player_15, R.string.player_name_15, R.string.player_team_15, R.string.player_dob_15, R.string.player_fun_fact_15),
    Player(R.drawable.player_16, R.string.player_name_16, R.string.player_team_16, R.string.player_dob_16, R.string.player_fun_fact_16),
    Player(R.drawable.player_17, R.string.player_name_17, R.string.player_team_17, R.string.player_dob_17, R.string.player_fun_fact_17),
    Player(R.drawable.player_18, R.string.player_name_18, R.string.player_team_18, R.string.player_dob_18, R.string.player_fun_fact_18),
    Player(R.drawable.player_19, R.string.player_name_19, R.string.player_team_19, R.string.player_dob_19, R.string.player_fun_fact_19),
    Player(R.drawable.player_20, R.string.player_name_20, R.string.player_team_20, R.string.player_dob_20, R.string.player_fun_fact_20),
    Player(R.drawable.player_21, R.string.player_name_21, R.string.player_team_21, R.string.player_dob_21, R.string.player_fun_fact_21),
    Player(R.drawable.player_22, R.string.player_name_22, R.string.player_team_22, R.string.player_dob_22, R.string.player_fun_fact_22),
    Player(R.drawable.player_23, R.string.player_name_23, R.string.player_team_23, R.string.player_dob_23, R.string.player_fun_fact_23),
    Player(R.drawable.player_24, R.string.player_name_24, R.string.player_team_24, R.string.player_dob_24, R.string.player_fun_fact_24),
    Player(R.drawable.player_25, R.string.player_name_25, R.string.player_team_25, R.string.player_dob_25, R.string.player_fun_fact_25),
    Player(R.drawable.player_26, R.string.player_name_26, R.string.player_team_26, R.string.player_dob_26, R.string.player_fun_fact_26),
    Player(R.drawable.player_27, R.string.player_name_27, R.string.player_team_27, R.string.player_dob_27, R.string.player_fun_fact_27),
    Player(R.drawable.player_28, R.string.player_name_28, R.string.player_team_28, R.string.player_dob_28, R.string.player_fun_fact_28),
    Player(R.drawable.player_29, R.string.player_name_29, R.string.player_team_29, R.string.player_dob_29, R.string.player_fun_fact_29),
    Player(R.drawable.player_30, R.string.player_name_30, R.string.player_team_30, R.string.player_dob_30, R.string.player_fun_fact_30)
)
