package common.basic.geometiries

import spock.lang.Specification

class PointDTest extends Specification {

    def "Absolute"() {

        expect:
        point.absolute() == result

        where:
        point                       ||  result
        new PointD(10, 10)          ||  new PointD(10, 10)
        new PointD(10.0, 10.0)      ||  new PointD(10.0, 10.0)
        new PointD(10.0, 10)        ||  new PointD(10, 10.0)
        new PointD(-10, 10.0)       ||  new PointD(10, 10.0)
        new PointD(22.225, 16.204)  ||  new PointD(22.225, 16.204)
        new PointD(-56.29, -962.2)  ||  new PointD(56.29, 962.2)
        new PointD(-129.0, -77.0)   ||  new PointD(129, 77)
    }

    def "Negate"() {

        expect:
        point.negate() == result

        where:
        point                       ||  result
        new PointD(10, 10)          ||  new PointD(-10, -10)
        new PointD(10.0, 10.0)      ||  new PointD(-10.0, -10.0)
        new PointD(10.0, 10)        ||  new PointD(-10, -10.0)
        new PointD(-10, 10.0)       ||  new PointD(10, -10.0)
        new PointD(22.225, 16.204)  ||  new PointD(-22.225, -16.204)
        new PointD(-56.29, -962.2)  ||  new PointD(56.29, 962.2)
        new PointD(-129.0, -77.0)   ||  new PointD(129, 77)
    }

    def "Multiply"() {

        expect:
        point.multiply(param) == result

        where:
        point                       ||  param       ||  result
        new PointD(10, 10)          ||  10.0        ||  new PointD(100, 100)
        new PointD(10.0, 10.0)      ||  10.0        ||  new PointD(100, 100)
        new PointD(26.98, 6.89)     ||  7.62        ||  new PointD(205.5876, 52.501799999999996)
        new PointD(-56.29, -962.2)  ||  9.6         ||  new PointD(-540.384, -9237.12)
        new PointD(22.225, -16.204) ||  -15.25      ||  new PointD(-338.93125000000003, 247.11100000000002)
        new PointD(-129.0, -77.0)   ||  23.58       ||  new PointD(-3041.8199999999997, -1815.6599999999999)
        new PointD(86.25, -98.2)    ||  3.5         ||  new PointD(301.875, -343.7)
    }

    def "DivideBy"() {

    }

    def "Delta"() {

    }

    def "Median"() {

    }

    def "Offset"() {

    }

    def "Advance"() {

    }

    def "Differ"() {

    }

    def "Equals"() {

    }

    def "HashCode"() {

    }

    def "ToString"() {

    }
}
