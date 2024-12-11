package com.example.ejemplonavegacion

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class segundofragmentDirections private constructor() {
  public companion object {
    public fun actionSegundofragmentToCuartofragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_segundofragment_to_cuartofragment)
  }
}
