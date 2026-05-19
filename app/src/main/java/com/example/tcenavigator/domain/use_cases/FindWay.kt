package com.example.tcenavigator.domain.use_cases

import com.example.tcenavigator.domain.pathfinding.Path
import com.example.tcenavigator.domain.pathfinding.Pathfinder
import com.example.tcenavigator.domain.tree.Tree

class FindWay(
    private val pathfinder: Pathfinder
) {

    suspend operator fun invoke(
        from: String,
        to: String,
        tree: Tree
    ): Path? {
        return pathfinder.findWay(from, to, tree)
    }
}