package com.example.gestaoestado.juros

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gestaoestado.calculo.calcularJuros
import com.example.gestaoestado.calculo.calcularMontante

class JurosScreenViewModel: ViewModel() {
    private val _capital = MutableLiveData<String>()
    val capital: LiveData<String> = _capital

    private val _taxa = MutableLiveData<String>()
    val taxa: LiveData<String> = _taxa

    private val _tempo = MutableLiveData<String>()
    val tempo: LiveData<String> = _tempo

    private val _juros = MutableLiveData<Double>()
    val juros: LiveData<Double> = _juros

    private val _montante = MutableLiveData<Double>()
    val montante: LiveData<Double> = _montante

    fun onCapitalChanged( novoCapital: String){
        _capital.value = novoCapital
    }
    fun onTaxaChanged(novaTaxa: String){
        _taxa.value = novaTaxa
    }
    fun onTempoChanged(novoTempo: String){
        _tempo.value = novoTempo
    }
    fun calcularJurosInvestimento(){
        _juros.value = calcularJuros(
            capital = _capital.value!!.toDouble(),
            taxa = _taxa.value!!.toDouble(),
            tempo = _tempo.value!!.toDouble()
        )
    }
    fun calcularMontanteInvestimento() {
        _montante.value = calcularMontante(
            capital = _capital.value!!.toDouble(),
            juros = _juros.value!!
        )
    }
}
