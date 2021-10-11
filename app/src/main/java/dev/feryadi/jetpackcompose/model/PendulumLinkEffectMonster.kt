package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.EffectMonsterCard
import dev.feryadi.jetpackcompose.model.contract.LinkMonsterCard
import dev.feryadi.jetpackcompose.model.contract.PendulumMonsterCard

class PendulumLinkEffectMonster(
    override var name: String,
    override var monsterEffect: String,
    override var link: Int,
    override var level: Int,
    override var attribute: Attribute,
    override var monsterType: MonsterType,
    override var scale: Int,
    override var spellEffect: String,
    override var attack: Int,
    override var defense: Int,
    override var battlePosition: BattlePosition
) : PendulumMonsterCard, LinkMonsterCard, EffectMonsterCard {
}