package com.gyoge

import kotlin.test.Test

class KruskalTester {
    @Test
    fun test1() {
        val weights = listOf(
            listOf(0, 3, 0, 0, 4, 7),
            listOf(3, 0, 5, 0, 0, 8),
            listOf(0, 5, 0, 4, 0, 6),
            listOf(0, 0, 4, 0, 2, 8),
            listOf(4, 0, 0, 2, 0, 5),
            listOf(7, 8, 6, 8, 5, 0)
        )

        val krusk = Kruskal()

        (1..6)
            .map { Node(it) }
            .forEach { krusk.addNode(it) }

        weights.forEachIndexed { i, row ->
            row.forEachIndexed { j, weight ->
                if (weight != 0) {
                    krusk.addEdge(i, j, weight)
                }
            }
        }

        krusk.makeMST()
        println(krusk)
    }


    @Test
    fun test2() {
        val weights = listOf(
            listOf(0, 18, 0, 15, 0, 0),
            listOf(0, 0, 9, 6, 0, 0),
            listOf(0, 0, 0, 14, 10, 28),
            listOf(0, 0, 0, 0, 7, 0),
            listOf(0, 0, 0, 0, 0, 36),
            listOf(0, 0, 0, 0, 0, 0),
        )

        val krusk = Kruskal()

        (1..6)
            .map { Node(it) }
            .forEach { krusk.addNode(it) }

        weights.forEachIndexed { i, row ->
            row.forEachIndexed { j, weight ->
                if (weight != 0) {
                    krusk.addEdge(i, j, weight)
                }
            }
        }

        krusk.makeMST()
        println(krusk)
    }
}