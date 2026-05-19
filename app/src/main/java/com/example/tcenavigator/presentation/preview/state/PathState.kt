package com.example.tcenavigator.presentation.preview.state

import com.example.tcenavigator.domain.pathfinding.Path
import com.example.tcenavigator.domain.tree.TreeNode

data class PathState(
    val startEntry: TreeNode.Entry? = null,
    val endEntry: TreeNode.Entry? = null,
    val path: Path? = null
)
