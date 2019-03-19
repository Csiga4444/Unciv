package com.unciv

import com.unciv.logic.GameSaver

class GameSettings {
    var showWorkedTiles: Boolean = false
    var showResourcesAndImprovements: Boolean = true
    var language: String = "English"
    var resolution: String = "1050x700"
    var tutorialsShown = ArrayList<String>()
    var hasCrashedRecently = false
    var soundEffectsVolume = 0.5f
    var turnsBetweenAutosaves = 1
    var tileSet:String = "Default"

    fun save(){
        GameSaver().setGeneralSettings(this)
    }
}