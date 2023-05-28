package com.aaa.scan_activity

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.ANTI_ALIAS_FLAG
import android.graphics.PointF
import android.util.AttributeSet
import android.util.Size
import android.view.View
import com.google.mlkit.vision.common.PointF3D
import com.google.mlkit.vision.pose.Pose
import com.google.mlkit.vision.pose.PoseLandmark

class LandmarkView (
    private val context: Context,
    private val attributes: AttributeSet
    ): View(context,attributes) {

    private var viewSize = Size(0, 0)
    private var mainPaint = Paint()
    private var detectionPose : Pose? = null
    private var sourceSize = Size(0,0)

    init {
        mainPaint.flags = ANTI_ALIAS_FLAG
        mainPaint.color = Color.CYAN
        mainPaint.style = Paint.Style.FILL
    }

    fun setPose(newPose: Pose, newsize: Size)
    {
        detectionPose = newPose
        sourceSize = newsize
        invalidate()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        viewSize = Size(w, h)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        drawPoints(canvas)
        drawLines(canvas)
    }

    private fun convertPoint(targetPoint: PointF3D) : PointF
    {
        val x1 = targetPoint.x
        val y1 = targetPoint.y
        val w1 = sourceSize.width
        val h1 = sourceSize.height

        val w2 = viewSize.width
        val h2 = viewSize.height

        val x2 = x1 * (w2 / w1)
        val y2 = y1 * (h2 / h1)
        return PointF(x2, y2)
    }

    private fun drawPoint(canvas: Canvas?, center: PointF3D)
    {
        val convertedPoint = convertPoint(center)
        canvas?.drawCircle(
            convertedPoint.x,
            convertedPoint.y,
            10f,
            mainPaint
        )
    }

    private fun drawPoints(canvas: Canvas?)
    {
        var currentPoint = detectionPose?.getPoseLandmark(0)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(1)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(2)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(3)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(4)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(5)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(6)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(7)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(8)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(9)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(10)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(11)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(12)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(13)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(14)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(15)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(16)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(17)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(18)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(19)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(20)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(21)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(22)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(23)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(24)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(25)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(26)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(27)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(28)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(29)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(30)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(31)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
        currentPoint = detectionPose?.getPoseLandmark(32)
        if(currentPoint != null)
        {
            drawPoint(canvas, currentPoint.position3D)
        }
    }

    private fun drawLine(start: PointF3D, end: PointF3D, canvas: Canvas?)
    {
        val convertedStart = convertPoint(start)
        val convertedEnd = convertPoint(end)
        canvas?.drawLine(
            convertedStart.x,
            convertedStart.y,
            convertedEnd.x,
            convertedEnd.y,
            mainPaint
        )
    }

    private fun drawLines(canvas: Canvas?)
    {
        var startPoint = detectionPose?.getPoseLandmark(8)
        var endPoint = detectionPose?.getPoseLandmark(6)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }

        startPoint = detectionPose?.getPoseLandmark(6)
        endPoint = detectionPose?.getPoseLandmark(5)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }

        startPoint = detectionPose?.getPoseLandmark(5)
        endPoint = detectionPose?.getPoseLandmark(4)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }

        startPoint = detectionPose?.getPoseLandmark(4)
        endPoint = detectionPose?.getPoseLandmark(0)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }

        startPoint = detectionPose?.getPoseLandmark(0)
        endPoint = detectionPose?.getPoseLandmark(1)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }

        startPoint = detectionPose?.getPoseLandmark(1)
        endPoint = detectionPose?.getPoseLandmark(2)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }

        startPoint = detectionPose?.getPoseLandmark(2)
        endPoint = detectionPose?.getPoseLandmark(3)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }

        startPoint = detectionPose?.getPoseLandmark(3)
        endPoint = detectionPose?.getPoseLandmark(7)
        if(startPoint != null && endPoint != null)
        {
            drawLine(startPoint.position3D, endPoint.position3D, canvas)
        }
    }
}