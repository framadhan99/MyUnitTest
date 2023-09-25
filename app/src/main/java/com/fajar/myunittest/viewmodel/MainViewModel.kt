package com.fajar.myunittest.viewmodel

import com.fajar.myunittest.model.CuboidModel

class MainViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumference() = cuboidModel.getCircumference()

    fun getSurfaceArea() = cuboidModel.getSurfaceArea()

    fun getVolume() = cuboidModel.getVolume()

    fun save(w: Double, l: Double, h: Double) {
        cuboidModel.save(w, l, h)
    }
}