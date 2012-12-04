package no.bekk.boss

import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._

class FooSimulation extends Simulation {

	def apply = {
		// This is where your simulation should be coded
	  
		val scn = scenario("Some scenario").exec(http("frontpage").get("http://www.example.com/"))
	  
		List(scn.configure.users(10).ramp(10))
	}
}