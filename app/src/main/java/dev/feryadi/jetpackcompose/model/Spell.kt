package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.SpellCard

class Spell(
    override var name: String,
    override var spellEffect: String,
) : SpellCard {
}