package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.LinkMonsterCard
import dev.feryadi.jetpackcompose.model.contract.NormalMonsterCard

class LinkNormalMonster(
    override var name: String,
    override var link: Int,
    override var level: Int,
    override var attribute: Attribute,
    override var monsterType: MonsterType,
    override var attack: Int,
    override var defense: Int,
    override var battlePosition: BattlePosition
) : LinkMonsterCard, NormalMonsterCard {
}