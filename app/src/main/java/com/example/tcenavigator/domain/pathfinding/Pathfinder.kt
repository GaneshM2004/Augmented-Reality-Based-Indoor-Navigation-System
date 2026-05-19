package com.example.tcenavigator.domain.pathfinding

import com.example.tcenavigator.domain.tree.Tree

interface Pathfinder {

    suspend fun findWay(
        from: String,
        to: String,
        tree: Tree
    ): Path?

}