package com.example.myfirstkotlinapp

import android.icu.text.CaseMap

data class RecyclerData (val title: String, val content: String, val images: Int)

fun getData(): List<RecyclerData>  {
    return listOf(
        RecyclerData("Transport Car",
            "Transport car which carries a mattress", R.drawable.car_carry),
        RecyclerData("Smiling Car",
            "Smiling car which travels with a a big smile by blinking the head light",
            R.drawable.smiling_car),
        RecyclerData("School Bus", "This School bus carries children to school",
            R.drawable.bus_img),
        RecyclerData("Car plane", "This car carries passengers, But it is a flight",
            R.drawable.side_car),
        RecyclerData("Tempo Car", "This is tempo , generally used to carry passengers " +
                "and for loading vegetables", R.drawable.tempo_car),
        RecyclerData("Taxi car", "Taxi car generally carries passengers and for long " +
                "trips", R.drawable.taxi_car),
        RecyclerData("Washing car", "Washing car cleans itself, so that it always looks " +
                "shiny", R.drawable.washing_car),
        RecyclerData("Smiling Car", "This smiling car always ready to carry passengers" +
                " with at most pleasure",
            R.drawable.smiling_car_teeth)

    )

}