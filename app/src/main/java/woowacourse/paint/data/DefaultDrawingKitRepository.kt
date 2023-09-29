package woowacourse.paint.data

import woowacourse.paint.model.DrawingTool
import woowacourse.paint.model.PaintColor
import woowacourse.paint.repository.DrawingKitRepository

class DefaultDrawingKitRepository : DrawingKitRepository {
    private var drawingTool = DrawingTool.PEN
    private val drawingTools = DrawingTool.values().toList()
    private var paintColor = PaintColor("#FF0000")
    private val paintColors = listOf(
        PaintColor("#FF0000"),
        PaintColor("#FFA500"),
        PaintColor("#FFFF00"),
        PaintColor("#008000"),
        PaintColor("#0000FF"),
    )

    override fun getDrawingTool(): DrawingTool {
        return drawingTools.first()
    }

    override fun setDrawingTool(drawingTool: DrawingTool) {
        this.drawingTool = drawingTool
    }

    override fun getAllDrawingTools(): List<DrawingTool> {
        return drawingTools
    }

    override fun getPaintColor(): PaintColor {
        return paintColor
    }

    override fun setPaintColor(paintColor: PaintColor) {
        this.paintColor = paintColor
    }

    override fun getAllPaintColors(): List<PaintColor> = paintColors
}