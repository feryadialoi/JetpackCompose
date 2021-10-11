package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.NormalMonsterCard
import dev.feryadi.jetpackcompose.model.contract.PendulumMonsterCard

class PendulumNormalMonster(
    override var name: String,
    override var level: Int,
    override var attribute: Attribute,
    override var monsterType: MonsterType,
    override var spellEffect: String,
    override var scale: Int,
    override var attack: Int,
    override var defense: Int,
    override var battlePosition: BattlePosition,
) : PendulumMonsterCard, NormalMonsterCard {
}