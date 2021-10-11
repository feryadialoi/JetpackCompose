package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.TrapCard

class Trap(
    override var name: String,
    override var trapEffect: String,
) : TrapCard {
}