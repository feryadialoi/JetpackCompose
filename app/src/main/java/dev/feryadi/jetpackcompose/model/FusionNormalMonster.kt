package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.FusionMonsterCard
import dev.feryadi.jetpackcompose.model.contract.NormalMonsterCard

class FusionNormalMonster(
    override var name: String,
    override var level: Int,
    override var attribute: Attribute,
    override var monsterType: MonsterType,
    override var attack: Int,
    override var defense: Int,
    override var battlePosition: BattlePosition
) : FusionMonsterCard, NormalMonsterCard {
}