// Пример Ясного кода

// Лабораторная работа с мотоциклом, оксаной и одометром.

public class VaruablesName {

    int odometer(int [] oksana){ - int calculateDistance(int [] odometerReadings)
        // Расчет пройденного расстояния

        int N = oksana.length; - int N = odometerReadings.length;
        // количество показаний одометра

        int oldt = 0; - int previousTime = 0;
        // Хранение предыдушего значения времени

        int S = 0; - int totalDistance = 0;
        // Общее пройденное расстояние

        int vi= 0; - int vehicleVelocity = 0;
        // текущая скорость транспортного срдества


        int ti = 0; - int currentTime = 0;
        // Текущее значение времени

        int dt = 0; - int timeDifference = 0;
        // Хранение значения временоого интервала

        int ds = 0; - int traveledDistance = 0;
        // Хранение расстояния пройденного транспортным средством за временной интервал


        for (int i=0; i < N; i=i+2){

            vi = oksana[i]; - vehicleVelocity = odometerReadings[i];


            ti = oksana[i+1]; - currentTime = odometerReadings[i+1];


            dt = ti - oldt; - timeDifference = currentTime - previousTime;


            oldt = ti; - previousTime = currentTime;


            ds = vi * dt; - traveledDistance = vehicleVelocity * timeDifference;


            S += ds; - totalDistance += traveledDistance;

        }
        return S; - return totalDistance;
    }














}



