package dev.feryadi.jetpackcompose.model.contract

import dev.feryadi.jetpackcompose.model.Attribute
import dev.feryadi.jetpackcompose.model.BattlePosition
import dev.feryadi.jetpackcompose.model.MonsterType

interface MonsterCard : Card {
    var level: Int
    var attribute: Attribute
    var monsterType: MonsterType
    var attack: Int
    var defense: Int
    var battlePosition: BattlePosition
}