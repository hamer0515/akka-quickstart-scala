package com.lightbend.akka.sample

object DeviceManager {

  final case class RequestTrackDevice(groupId: String, deviceId: String)

  case object DeviceRegistered

}

class DeviceManager {

}
