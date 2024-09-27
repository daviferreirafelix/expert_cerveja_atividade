package com.si.mostrarcervejas

class ExpertCervejas {
    private val lager   = arrayOf("Brahma Extra","Corona","Heineken")
    private val pilsen  = arrayOf("Antarctica","Bavaria","Brahma")
    private val ipa     = arrayOf("American IPA","English IPA","Imperial IPA")
    private val bock    = arrayOf("Eisenbahn Dunke","Heller Bock","Dunkler Bock")
    private val amber   = arrayOf("Brooklyn Lager")
    private val weiss   = arrayOf("Erdinger Weissbier","Paulaner Hefe-Weizen")

    private val marcas  = arrayOf(lager,pilsen,ipa,bock,amber,weiss)

    fun getMarcas(): Array<Array<String>> {
        return marcas
    }
}