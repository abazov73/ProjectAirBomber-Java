/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.util.Random;
/**
 *
 * @author Андрей
 */
public class SetAirBombersGenericDop<T extends EntityAirBomber, U extends IDrawingObjectDop> {
    private Object[] _bases;
    private Object[] _engines;
    private int Count;
    
    public SetAirBombersGenericDop(int count){
        _bases = new Object[count];
        _engines =  new Object[count];
        Count = count;
    }
    
    public int add(T base){
        return add(base, 0);
    }
    
    public int add(T base, int position){
        if (position >= _bases.length)
        {
            return -1;
        }
        if (_bases[position] != null)
        {
            int indexNull = -1;
            for (int i = position; i < _bases.length; i++)
            {
                if (_bases[i] == null)
                {
                    indexNull = i;
                    break;
                }
            }
            if (indexNull == -1) return -1;
            for (int i = indexNull; i > position; i--)
            {
                T tmp = (T) _bases[i];
                _bases[i] = _bases[i - 1];
                _bases[i - 1] = tmp;
            }
        }
        _bases[position] = base;
        return position;
    }
    
    public int add(U engine){
        return add(engine, 0);
    }
    
    public int add(U engine, int position){
        if (position >= _engines.length)
        {
            return -1;
        }
        if (_engines[position] != null)
        {
            int indexNull = -1;
            for (int i = position; i < _engines.length; i++)
            {
                if (_engines[i] == null)
                {
                    indexNull = i;
                    break;
                }
            }
            if (indexNull == -1) return -1;
            for (int i = indexNull; i > position; i--)
            {
                U tmp = (U) _engines[i];
                _engines[i] = _engines[i - 1];
                _engines[i - 1] = tmp;
            }
        }
        _engines[position] = engine;
        return position;
    }
    
    
    public DrawingAirBomber buildAirBomber(){
        Random rnd = new Random();
        int baseIndex = rnd.nextInt(0, _bases.length);
        int engineIndex = rnd.nextInt(0, _engines.length);
        EnginesType enginesType;
        T selectedBase = (T) _bases[baseIndex];
        U selectedEngines = (U) _engines[engineIndex];
        if (selectedEngines instanceof DrawingEngines) enginesType = EnginesType.RECTANGLE;
        else if (selectedEngines instanceof DrawingEnginesTriangle) enginesType = EnginesType.TRIANGLE;
        else enginesType = EnginesType.OVAL;
        return new DrawingAirBomber(selectedBase.getSpeed(), selectedBase.getWeight(), selectedBase.getBodyColor(), selectedEngines.getNumberOfEngines(), enginesType);
    }
}
