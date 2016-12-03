package com.sneakingshadow.core.multiblock.structureblock.special;

import com.sneakingshadow.core.multiblock.structureblock.StructureBlock;
import net.minecraft.world.World;

import static com.sneakingshadow.core.multiblock.MultiBlockInit.REPLACEABLE_BLOCK;

public class SBlockReplaceable extends StructureBlock {

    public boolean blockIsValid(World world, int x, int y, int z){
        return world.getBlock(x,y,z).isReplaceable(world,x,y,z);
    }

    /**
     * A small un-official check to determine if it should continue checking in world.
     */
    @Override
    public boolean startCheckingForStructure(World world, int x, int y, int z) {
        return blockIsValid(world, x, y, z);
    }

    public String toString() {
        return "'" + REPLACEABLE_BLOCK + "'";
    }

}