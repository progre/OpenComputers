package li.cil.oc.common.item

class UpgradeContainerCard(val parent: Delegator, val tier: Int) extends Delegate with traits.ItemTier {
  override val unlocalizedName = super.unlocalizedName + tier

  override protected def tooltipName = Option(super.unlocalizedName)

  override protected def tooltipData = Seq(tier + 1)
}
