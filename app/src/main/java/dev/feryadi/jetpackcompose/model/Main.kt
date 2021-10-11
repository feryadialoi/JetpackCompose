package dev.feryadi.jetpackcompose.model

import dev.feryadi.jetpackcompose.model.contract.Card
import dev.feryadi.jetpackcompose.model.contract.MonsterCard
import dev.feryadi.jetpackcompose.model.contract.SpellCard
import dev.feryadi.jetpackcompose.model.contract.TrapCard

fun main() {

    val cardOfConsonance: Spell = Spell(
        name = "Card Of Consonance",
        spellEffect = ""
    )

    val karmaCut: Trap = Trap(
        name = "Karma Cut",
        trapEffect = ""
    )

    val darkMagician: NormalMonster = NormalMonster(
        name = "Dark Magician",
        level = 7,
        attribute = Attribute.DARK,
        monsterType = MonsterType.SPELLCASTER,
        attack = 2500,
        defense = 2100,
        battlePosition = BattlePosition.ATTACK
    )

    val theWhiteStoneOfAncients: EffectTunerMonster = EffectTunerMonster(
        name = "The White Stone Of Legend",
        level = 1,
        attribute = Attribute.LIGHT,
        monsterType = MonsterType.DRAGON,
        monsterEffect = "",
        attack = 600,
        defense = 500,
        battlePosition = BattlePosition.ATTACK
    )

    val blueEyesWhiteDragon: NormalMonster = NormalMonster(
        name = "Blue Eyes White Dragon",
        level = 8,
        attribute = Attribute.LIGHT,
        monsterType = MonsterType.DRAGON,
        attack = 3000,
        defense = 2500,
        battlePosition = BattlePosition.ATTACK
    )

    val blueEyesSpiritDragon: EffectSynchroMonster = EffectSynchroMonster(
        name = "Blue Eyes Spirit Dragon",
        level = 9,
        attribute = Attribute.LIGHT,
        monsterType = MonsterType.DRAGON,
        monsterEffect = "",
        attack = 2500,
        defense = 3000,
        battlePosition = BattlePosition.ATTACK
    )

    val listCards: MutableList<Card> = mutableListOf(
        cardOfConsonance,
        karmaCut,
        darkMagician,
        theWhiteStoneOfAncients,
        blueEyesSpiritDragon,
        blueEyesWhiteDragon
    )


    val listMonsterCards: MutableList<MonsterCard> =
        listCards.filterIsInstance<MonsterCard>() as MutableList<MonsterCard>

    val listSpellTrapCards: MutableList<Card> =
        listCards.filter { it is SpellCard || it is TrapCard } as MutableList<Card>

    listCards.forEach {
        println(it)
    }

    println("===========================================")

    listSpellTrapCards.forEach {
        println(
            """
            [${it.javaClass.simpleName}] ${it.name}
        """.trimIndent()
        )
    }

    println("===========================================")

    listMonsterCards.forEach {
        println(
            """
            name            : ${it.name}
            level           : ${it.level}
            attribute       : ${it.attribute}
            monster type    : ${it.monsterType}
            attack          : ${it.attack}
            defense         : ${it.defense}
            =========================================
        """.trimIndent()
        )
    }

}