package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.EffectMonsterCard
import dev.feryadi.jetpackcompose.model.contract.FusionMonsterCard

class FusionEffectMonster(
    override var name: String,
    override var monsterEffect: String,
    override var level: Int,
    override var attribute: Attribute,
    override var monsterType: MonsterType,
    override var attack: Int,
    override var defense: Int,
    override var battlePosition: BattlePosition
) : FusionMonsterCard, EffectMonsterCard {

}