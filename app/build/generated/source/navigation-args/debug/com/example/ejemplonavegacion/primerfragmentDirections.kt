package com.example.ejemplonavegacion

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class primerfragmentDirections private constructor() {
  private data class ActionPrimerfragmentToSegundofragment(
    public val nombre: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_primerfragment_to_segundofragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("nombre", this.nombre)
        return result
      }
  }

  private data class ActionPrimerfragmentToTercerfragment(
    public val nombre: String = "nombre",
  ) : NavDirections {
    public override val actionId: Int = R.id.action_primerfragment_to_tercerfragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("nombre", this.nombre)
        return result
      }
  }

  public companion object {
    public fun actionPrimerfragmentToSegundofragment(nombre: String): NavDirections =
        ActionPrimerfragmentToSegundofragment(nombre)

    public fun actionPrimerfragmentToTercerfragment(nombre: String = "nombre"): NavDirections =
        ActionPrimerfragmentToTercerfragment(nombre)
  }
}
