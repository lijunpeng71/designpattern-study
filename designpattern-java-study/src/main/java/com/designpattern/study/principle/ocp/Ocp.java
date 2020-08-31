package com.designpattern.study.principle.ocp;

public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawTriangle(new Triangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape.type == 1) {
            drawRectangle(shape);
        } else if (shape.type == 2) {
            drawCircle(shape);
        } else if (shape.type == 3) {
            drawTriangle(shape);
        }
    }

    public void drawRectangle(Shape shape) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape shape) {
        System.out.println("绘制圆形");
    }

    public void drawTriangle(Shape shape) {
        System.out.println("绘制三角形");
    }
}

//shape基类
class Shape {

    int type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.type = 2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super.type = 3;
    }
}

