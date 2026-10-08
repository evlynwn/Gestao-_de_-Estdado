package com.example.gestaoestado.componentes

import android.R.attr.label
import android.R.attr.text
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import java.lang.reflect.Modifier

@Composable
fun CaixaDeEntrada(
    modifier: Modifier,
    label: String,
    placeholder: String,
    keyboardType: KeyboardType,
    value: String,
    atualizaValor: (String) -> Unit
){
    OutlinedTextField(
        onValueChange = {
            atualizaValor(it)
        },
        modifier = modifier,
        label = { Text(text = label) },
        placeholder = {
            Text(text = placeholder)
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        ),
        value = value,
        onValueChange = {}
    )

}