/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

import java.awt.Color;

/**
 *
 * @author Андрей
 */
public class ExtentionAirBomber{
    public static class ExtentionedAirBomber {
        /// <summary>
        /// Разделитель для записи информации по объекту в файл
        /// </summary>
        private static String _separatorForObject = ":";
        /// <summary>
        /// Создание объекта из строки
        /// </summary>
        /// <param name="info"></param>
        /// <returns></returns>
        public static DrawingAirBomber CreateDrawningAirBomber(String info)
        {
            String[] strs = info.split(_separatorForObject);
            if (strs.length == 7) //заменить на передачу RGB
            {
                EnginesType enginesType = null;
                switch (strs[6]) {
                    case "DrawingEngines":
                        enginesType = EnginesType.RECTANGLE;
                        break;
                    case "DrawingEnginesTriangle":
                        enginesType = EnginesType.TRIANGLE;
                        break;
                    case "DrawingEnginesOval":
                        enginesType = EnginesType.OVAL;
                        break;
                }
                return new DrawingAirBomber(Integer.parseInt(strs[0]),
                    Integer.parseInt(strs[1]), new Color(Integer.parseInt(strs[2]), Integer.parseInt(strs[3]), Integer.parseInt(strs[4])), Integer.parseInt(strs[5]), enginesType);
            }
            if (strs.length == 13)
            {
                EnginesType enginesType =  null;
                switch (strs[6]) {
                    case "DrawingEngines":
                        enginesType = EnginesType.RECTANGLE;
                        break;
                    case "DrawingEnginesTriangle":
                        enginesType = EnginesType.TRIANGLE;
                        break;
                    case "DrawingEnginesOval":
                        enginesType = EnginesType.OVAL;
                        break;
                }
                return new DrawingHeavyAirBomber(Integer.parseInt(strs[0]), Float.parseFloat(strs[1]),
                        new Color(Integer.parseInt(strs[2]), Integer.parseInt(strs[3]),Integer.parseInt(strs[4])),
                        Integer.parseInt(strs[5]), enginesType, 
                        new Color(Integer.parseInt(strs[7]), Integer.parseInt(strs[8]), Integer.parseInt(strs[9])), 
                        Boolean.parseBoolean(strs[10]),Boolean.parseBoolean(strs[11]), Boolean.parseBoolean(strs[12]));
            }
            return null;
        }
        public static String GetDataForSave(DrawingAirBomber drawningAirBomber)
        {
            var airBomber = drawningAirBomber.AirBomber;
            var str = String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s", airBomber.getSpeed(), _separatorForObject, Math.round(airBomber.getWeight()), _separatorForObject, airBomber.getBodyColor().getRed(), _separatorForObject, airBomber.getBodyColor().getGreen(), _separatorForObject, airBomber.getBodyColor().getBlue(), _separatorForObject, drawningAirBomber.drawingEngines.getNumberOfEngines(), _separatorForObject, drawningAirBomber.drawingEngines.getClass().getSimpleName());
            if (airBomber instanceof EntityHeavyAirBomber heavyAirBomber)
            {
                return String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s", str,_separatorForObject,heavyAirBomber.getDopColor().getRed(),_separatorForObject, heavyAirBomber.getDopColor().getGreen(), _separatorForObject, heavyAirBomber.getDopColor().getBlue(), _separatorForObject, heavyAirBomber.getBombs(), _separatorForObject, heavyAirBomber.getFuelTank(), _separatorForObject, heavyAirBomber.getTailLine());
            }
            else return str;
        }
    }
}
