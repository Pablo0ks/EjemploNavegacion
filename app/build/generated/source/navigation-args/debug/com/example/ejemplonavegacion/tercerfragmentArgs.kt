package com.example.ejemplonavegacion

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class tercerfragmentArgs(
  public val nombre: String = "nombre",
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("nombre", this.nombre)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("nombre", this.nombre)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): tercerfragmentArgs {
      bundle.setClassLoader(tercerfragmentArgs::class.java.classLoader)
      val __nombre : String?
      if (bundle.containsKey("nombre")) {
        __nombre = bundle.getString("nombre")
        if (__nombre == null) {
          throw IllegalArgumentException("Argument \"nombre\" is marked as non-null but was passed a null value.")
        }
      } else {
        __nombre = "nombre"
      }
      return tercerfragmentArgs(__nombre)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): tercerfragmentArgs {
      val __nombre : String?
      if (savedStateHandle.contains("nombre")) {
        __nombre = savedStateHandle["nombre"]
        if (__nombre == null) {
          throw IllegalArgumentException("Argument \"nombre\" is marked as non-null but was passed a null value")
        }
      } else {
        __nombre = "nombre"
      }
      return tercerfragmentArgs(__nombre)
    }
  }
}
