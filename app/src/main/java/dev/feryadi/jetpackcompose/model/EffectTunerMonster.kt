package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.EffectMonsterCard
import dev.feryadi.jetpackcompose.model.contract.TunerMonsterCard

class EffectTunerMonster(
    override var name: String,
    override var level: Int,
    override var attribute: Attribute,
    override var monsterType: MonsterType,
    override var monsterEffect: String,
    override var attack: Int,
    override var defense: Int,
    override var battlePosition: BattlePosition,
) : EffectMonsterCard, TunerMonsterCard {
}