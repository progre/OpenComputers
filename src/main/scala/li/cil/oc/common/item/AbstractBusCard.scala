package li.cil.oc.common.item

import li.cil.oc.integration.Mods

class AbstractBusCard(val parent: Delegator) extends Delegate with traits.ItemTier {
  showInItemList = Mods.StargateTech2.isAvailable
}
