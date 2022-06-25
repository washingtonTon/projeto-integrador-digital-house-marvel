package br.gturcheti.projeto_integrador_digital_house_marvel.data.dto

import com.google.gson.annotations.SerializedName

data class CharacterDTO(
    val id : Int,
    val name : String,
    val description: String,
    @SerializedName("thumbnail")
    val image: ThumbnailDTO,
)
