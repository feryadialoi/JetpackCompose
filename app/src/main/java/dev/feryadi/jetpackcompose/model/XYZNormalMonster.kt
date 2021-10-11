package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.NormalMonsterCard
import dev.feryadi.jetpackcompose.model.contract.XYZMonsterCard

class XYZNormalMonster(
    override var name: String,
    override var level: Int,
    override var attribute: Attribute,
    override var monsterType: MonsterType,
    override var rank: Int,
    override var attack: Int,
    override var defense: Int,
    override var battlePosition: BattlePosition,
) : XYZMonsterCard, NormalMonsterCard {
}