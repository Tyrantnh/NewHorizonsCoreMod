package com.dreammaster.gthandler.recipes;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GalaxySpace;
import static gregtech.api.util.GT_Recipe.GT_Recipe_Map.sFluidCannerRecipes;
import static gregtech.api.util.GT_RecipeBuilder.SECONDS;
import static gregtech.api.util.GT_RecipeBuilder.TICKS;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import com.dreammaster.gthandler.CustomItemList;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;

public class FluidCannerRecipes implements Runnable {

    @Override
    public void run() {
        // NAK and Helium Cooling Cells
        GT_Values.RA.stdBuilder().itemInputs(CustomItemList.TenKCell.get(1L))
                .itemOutputs(ItemList.Reactor_Coolant_NaK_1.get(1L))
                .fluidInputs(new FluidStack(FluidRegistry.getFluid("sodiumpotassium"), 1000)).noFluidOutputs()
                .duration(16 * TICKS).eut(1).addTo(sFluidCannerRecipes);

        GT_Values.RA.stdBuilder().itemInputs(CustomItemList.ThirtyKCell.get(1L))
                .itemOutputs(ItemList.Reactor_Coolant_NaK_3.get(1L))
                .fluidInputs(new FluidStack(FluidRegistry.getFluid("sodiumpotassium"), 3000)).noFluidOutputs()
                .duration(2 * SECONDS + 8 * TICKS).eut(1).addTo(sFluidCannerRecipes);

        GT_Values.RA.stdBuilder().itemInputs(CustomItemList.SixtyKCell.get(1L))
                .itemOutputs(ItemList.Reactor_Coolant_NaK_6.get(1L))
                .fluidInputs(new FluidStack(FluidRegistry.getFluid("sodiumpotassium"), 6000)).noFluidOutputs()
                .duration(4 * SECONDS + 16 * TICKS).eut(1).addTo(sFluidCannerRecipes);

        // Space Cooling Cells
        GT_Values.RA.stdBuilder().itemInputs(CustomItemList.Empty180SpCell.get(1L))
                .itemOutputs(ItemList.Reactor_Coolant_Sp_1.get(1L)).fluidInputs(Materials.SuperCoolant.getFluid(1000L))
                .noFluidOutputs().duration(16 * TICKS).eut(1).addTo(sFluidCannerRecipes);

        GT_Values.RA.stdBuilder().itemInputs(CustomItemList.Empty360SpCell.get(1L))
                .itemOutputs(ItemList.Reactor_Coolant_Sp_2.get(1L)).fluidInputs(Materials.SuperCoolant.getFluid(2000L))
                .noFluidOutputs().duration(1 * SECONDS + 12 * TICKS).eut(1).addTo(sFluidCannerRecipes);

        GT_Values.RA.stdBuilder().itemInputs(CustomItemList.Empty540SpCell.get(1L))
                .itemOutputs(ItemList.Reactor_Coolant_Sp_3.get(1L)).fluidInputs(Materials.SuperCoolant.getFluid(3000L))
                .noFluidOutputs().duration(2 * SECONDS + 8 * TICKS).eut(1).addTo(sFluidCannerRecipes);

        GT_Values.RA.stdBuilder().itemInputs(CustomItemList.Empty1080SpCell.get(1L))
                .itemOutputs(ItemList.Reactor_Coolant_Sp_6.get(1L)).fluidInputs(Materials.SuperCoolant.getFluid(6000L))
                .noFluidOutputs().duration(4 * SECONDS + 16 * TICKS).eut(1).addTo(sFluidCannerRecipes);

        if (GalaxySpace.isModLoaded() && BartWorks.isModLoaded()) {
            GT_Values.RA.stdBuilder().itemInputs(CustomItemList.TenKCell.get(1L))
                    .itemOutputs(ItemList.Reactor_Coolant_He_1.get(1L))
                    .fluidInputs(new FluidStack(FluidRegistry.getFluid("liquid helium"), 1000)).noFluidOutputs()
                    .duration(16 * TICKS).eut(1).addTo(sFluidCannerRecipes);

            GT_Values.RA.stdBuilder().itemInputs(CustomItemList.ThirtyKCell.get(1L))
                    .itemOutputs(ItemList.Reactor_Coolant_He_3.get(1L))
                    .fluidInputs(new FluidStack(FluidRegistry.getFluid("liquid helium"), 3000)).noFluidOutputs()
                    .duration(2 * SECONDS + 8 * TICKS).eut(1).addTo(sFluidCannerRecipes);

            GT_Values.RA.stdBuilder().itemInputs(CustomItemList.SixtyKCell.get(1L))
                    .itemOutputs(ItemList.Reactor_Coolant_He_6.get(1L))
                    .fluidInputs(new FluidStack(FluidRegistry.getFluid("liquid helium"), 6000)).noFluidOutputs()
                    .duration(4 * SECONDS + 16 * TICKS).eut(1).addTo(sFluidCannerRecipes);
        }
    }
}
